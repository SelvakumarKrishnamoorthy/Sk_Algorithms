
AllSight - Graph DS Implementation:

Build a Generic In Memory Graph database using which clients can query the graph for the customers from a region who falls under specific age group.

Design & Implementation:

Build a Graph Structure using TAO (the association of objects) Model  ref :https://www.facebook.com/notes/facebook-engineering/tao-the-power-of-the-graph/10151525983993920/ .

The datastructure that we chose for storing objects is AdjacencyList in which vertex is the key and set of edges in the linkedList.

The graph is undirected graph.

Every user has a set of attributes like userid , name , age, country , phone etc.

our aim is to model the graph to filter on country and age , this filter can be extended further.

Junit is Provided with the primary and secondary filter to test the functionality.


