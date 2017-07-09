# PRIMITIVE DATA TYPES

The 8 primitive data types are as follows:

1) byte
2) short
3) int 
4) long
5) float
6) double
7) char
8) boolean 

A string is _almost_ a primitive. It's like a char, except that it can contain many more characters than a char;


# COPYING/MODIFYING ARRAYS

Let's say that you wanted to extend the size of an array. What would you do? That is, you wanted to extend an array of size 10 to be an array of size 12? What you have to do is create a new array with the desired size and then loop through the original array and drop off the old elements into the new one. (This gets to the string builder method that's talked about in CTCI)

Doing that continually is tedius. The DS that allows you not to have to worry so much about resizing are Lists and ArrayLists. The ArrayList handles the resizing automatically.