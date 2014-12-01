PREDICTIVE PARSING
========================

This document describes the data structures involved and their implementation
=============================================================================

    Grid
    =========================================================================
        The grid is essentially a 2D array holding the production laws
        It is indexed by Input and Grammar symbols

        An example of the grid using 
        - an input array like ['A', 'B', 'C', 'D']
        - a grammar array like ['Q', 'W', 'E', 'R']
        would produce something this :

        [['A', 'Q', 'PRODUCTION'], ['B', 'Q', 'PRODUCTION'], ['C', 'Q', 'PRODUCTION'], ['D', 'Q', 'PRODUCTION']]
        [['A', 'W', 'PRODUCTION'], ['B', 'W', 'PRODUCTION'], ['C', 'W', 'PRODUCTION'], ['D', 'W', 'PRODUCTION']]
        [['A', 'E', 'PRODUCTION'], ['B', 'E', 'PRODUCTION'], ['C', 'E', 'PRODUCTION'], ['D', 'E', 'PRODUCTION']]
        [['A', 'R', 'PRODUCTION'], ['B', 'R', 'PRODUCTION'], ['C', 'R', 'PRODUCTION'], ['D', 'R', 'PRODUCTION']]

        where PRODUCTION is the production that the current combination of Input and Grammar symbols produce
        - note that we are storing an array of size 3 (ie: index 0, 1 and 2)
        - in each index of the 2D array

        In other words, the expression array[i][j] will return an array of size 3
        We can access the following:
        - Input symbol by using array[i][j][0]
        - Grammar symbol by using array[i][j][1]
        - The respective PRODUCTION by using array[i][j][2]

        VARIABLES
            inputLength : length of the input array
            grammarLength : length of the grammar array
            _grid : The 2D array

        FUNCTIONS
            construct()
                loops through the input and grammar arrays and creates empty key value pairs

            set(input, grammar, production)
                sets the production at the specific key in _grid where 
                the input and grammar matches the 0th and the 1st index

            get(input, grammar)
                gets the production (if any) at the specific key in _grid where 
                the input and grammar matches the 0th and the 1st index
    ===========================================================================

    Stack
    ===========================================================================
        The stack is a very basic FIFO data structure
        If you don't know what is, I recommend you go to school
    ===========================================================================