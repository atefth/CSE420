var SENTINEL = "$";

var MARGIN, PADDING, WIDTH, HEIGHT;
MARGIN = 5;
PADDING = 5;
WIDTH = 70;
HEIGHT = 40;

var LAGNUAGE = [
	"id",
	"+",
	"*",
	"(",
	")",
	"$"
];

var GRAMMAR = [
	"E",
	"E'",
	"T",
	"T'",
	"F"
];

var INPUT = [
	"(", 
	"id", 
	"*", 
	"id", 
	")", 
	"+", 
	"id",
	"$"
];

var looping = true;

//Context variables
var canvas = document.getElementById("stage");
var context = canvas.getContext("2d");

//Button
var button = document.getElementById("restart");
button.addEventListener("click", function (argument) {
	construct();
});

//Toggle Button
var button = document.getElementById("toggle");
button.addEventListener("click", function (argument) {
	looping = !looping;
});

//Grid Datastructure
var grid = {
	input_length: null,
	grammar_length: null,
	_grid: null,
	construct: function (ILength, GLength) {
		this.input_length = ILength;
		this.grammar_length = GLength;
		this._grid = [];
		for (var i = 0; i < this.grammar_length; i++) {
			this._grid[i] = [];
			for (var j = 0; j < this.input_length; j++) {
				this._grid[i][j] = [];
				this._grid[i][j][0] = LAGNUAGE[j];
				this._grid[i][j][1] = GRAMMAR[i];
				this._grid[i][j][2] = SENTINEL;
			}
		}
	},
	set: function (GSymbol, ISymbol, Expression) {
		var x, y;
		for (var i = 0; i < this.grammar_length; i++) {
			if (GSymbol == this._grid[i][0][1]) {
				x = i;
			}
		}
		for (var i = 0; i < this.input_length; i++) {
			if (ISymbol == this._grid[0][i][0]) {
				y = i;
			}
		}
		this._grid[x][y][2] = Expression;
	},
	get: function (GSymbol, ISymbol) {
		var x, y;
		for (var i = 0; i < this.grammar_length; i++) {
			if (GSymbol == this._grid[i][0][1]) {
				y = i;
			}
		}
		for (var i = 0; i < this.input_length; i++) {
			if (ISymbol == this._grid[0][i][0]) {
				x = i;
			}
		}
		return this._grid[y][x][2];
	},
	init: function () {
		this.set("E", "id", "E -> T E'");
		this.set("T", "id", "T -> F T'");
		this.set("F", "id", "F -> id");
		this.set("E'", "+", "E' -> + T E'");
		this.set("T'", "+", "T' -> #");
		this.set("T'", "*", "T' -> * F T'");
		this.set("E", "(", "E -> T E'");
		this.set("T", "(", "T -> F T'");
		this.set("F", "(", "F -> ( E )");
		this.set("E'", ")", "E' -> #");
		this.set("T'", ")", "T' -> #");
		this.set("E'", "$", "E' -> #");
		this.set("T'", "$", "T' -> #");
	},
	debug: function () {
		for (var i = 0; i < this.grammar_length; i++) {
			for (var j = 0; j < this.input_length; j++) {
				console.log("[ (" + LAGNUAGE[i] + " | " + GRAMMAR[j] + ") , " + this._grid[i][j][2] + "]");
			}
		}
	}
}

//Stack Datastructure
var stack = {
	size: null,
	max: null,
	_stack: null,
	top: null,
	construct: function (element) {		
		this._stack = [];
		this._stack.push(element);
		this.size = 1;
		this.max = this.size;
		this.top = element;
	},
	push: function (element) {
		this._stack.push(element);
		this.size++;
		this.max = this.size;
		this.top = element;
	},
	pop: function () {
		var item = this._stack.pop();
		this.size--;
		head = this._stack[this.size];
		return item;
	},
	peek: function () {
		return this.top;
	},
	get: function (index) {
		return this._stack[index];
	}
}

//Predictive Parser
var parser = {
	input: null,
	inputPointer: null,
	top: null,
	construct: function () {
		stack.construct("$");
		this.inputPointer = 0;
		this.init();
	},
	init: function () {
		stack.push("E");
		this.input = INPUT[this.inputPointer];
		this.top = stack.peek();
	},
	parse: function () {
		if(this.inputPointer < INPUT.length){
			this.top = stack.pop();
			if(this.top == this.input){
				this.inputPointer++;
				this.input = INPUT[this.inputPointer];
			}else{
				var value = grid.get(this.top, this.input);
				console.log(value);
				if(value[value.length - 1] != "#"){
					var literals = value.split(" ");
					for (var i = literals.length - 1; i > 1; i--){
						stack.push(literals[i]);
					}
				}
			}
		}
	}
}

construct();

function construct () {
	grid.construct(LAGNUAGE.length, GRAMMAR.length);
	grid.init();
	parser.construct();	
	drawInit();
	setInterval(function () {
		parse();
	}, 5000);
}

function drawInit () {
	clear();
	drawTable();
	drawStack();
	draw();
}

function clear () {
	context.clearRect ( 0 , 0 , canvas.width, canvas.height );
}

function drawTable () {
	var value;
	for (var i = 0; i < grid.grammar_length; i++) {
		for (var j = 0; j < grid.input_length; j++) {
			context.fillStyle = "#666";
			context.fillRect((j * WIDTH)+(j * MARGIN), (i * HEIGHT)+(i * MARGIN), WIDTH, HEIGHT);
			context.fillStyle = "#fff";
			value = grid._grid[i][j][2];
			if (value != "$") {
				context.fillText(value, (j * WIDTH) + (j*MARGIN) + (MARGIN * 3), (i * HEIGHT) + (i*MARGIN) + (5 * MARGIN));
			}			
		}
	}
}

function drawStack () {	
	for(var i = 0; i < stack.size; i++){
		context.fillStyle = "#444";
		if (i == 0) {
			context.fillStyle = "#999";
		}
		context.fillRect(460, (i * HEIGHT) + (i * MARGIN), WIDTH, HEIGHT);
	}
	for(var i = stack.size; i < stack.max; i++){
		context.fillStyle = "#fff";
		context.fillRect(460, (i * HEIGHT) + (i * MARGIN), WIDTH, HEIGHT);
	}
}

function draw () {
	var value;
	for(var i = 0; i < stack.size; i++){
		value = stack.get(i);
		context.fillStyle = "#fff";
		context.fillText(value, 490, (stack.size * (HEIGHT+ MARGIN)) - (i * HEIGHT) - (i*MARGIN) - (HEIGHT/2));
	}
}

function parse () {
	if (looping) {
		if(stack.size > 0){
			parser.parse();
			drawStack();
			draw();
		}
	}
}