# Points-on-a-Rectangle-
Hackerrank Solution in JAVA
You are given  queries where each query consists of a set of  points on a two-dimensional plane (i.e., ). For each set of points, print YES on a new line if all the points fall on the edges (i.e., sides and/or corners) of a non-degenerate rectangle which is axis parallel; otherwise, print NO instead.

Input Format
The first line contains a single positive integer, q, denoting the number of queries. The subsequent lines describe each query in the following format:

1. The first line contains a single positive integer, n, denoting the number of points in the query.
2. Each line i of the n subsequent lines contains two space-separated integers describing the respective values of xi and yi for the point at coordinate (xi, yi).

Output Format

For each query, print YES on a new line if all n points lie on the edges of some non-degenerate rectangle which is axis parallel; otherwise, print NO instead.

Sample Input

2
3
0 0
0 1
1 0
4
0 0
0 2
2 0
1 1

Sample Output

YES
NO

Explanation : 

We perform the following q=2 queries:

In the first query, all points lie on the edges of a non-degenerate rectangle with corners at (0,0), (0,1), (1,0), and (1,1). Thus, we print YES on a new line.
In the second query, points (0,0), (0,2), (2,0) and  could all lie along the edge of some non-degenerate rectangle, but point (1,1) would have to fall inside that rectangle. Thus, we print NO on a new line.
