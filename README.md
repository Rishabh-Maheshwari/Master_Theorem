# Master Theorem
Find time complexity of your algorithm using Master Theorem.

The master theorem sometimes yields asymptotically tight bounds to some recurrences from divide and conquer algorithms that partition an input into smaller subproblems of equal sizes, solve the subproblems recursively, and then combine the subproblem solutions to give a solution to the original problem. The time for such an algorithm can be expressed by adding the work that they perform at the top level of their recursion (to divide the problems into subproblems and then combine the subproblem solutions) together with the time made in the recursive calls of the algorithm. If T(n) denotes the total time for the algorithm on an input of size n, and f(n) denotes the amount of time taken at the top level of the recurrence then the time can be expressed by a recurrence relation that takes the form:

![alt text](https://wikimedia.org/api/rest_v1/media/math/render/svg/6a2b5943d03e647b0061f4c327cc38cf7d43ff03)

Cases are as follows for Master Theorem:

![alt text](https://i.imgur.com/u7pUp9p.jpg)

Master Theorem can not be applied to:

![alt text](https://i.imgur.com/ZDhg3l8.jpg)
