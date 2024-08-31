// Consider a program that uses the fork() system call to create a child process. Initially, the parent process has a variable x with a value of 5. After forking, both the parent and child processes increment the value of x by 1.
// What will be the final values of x in the parent and child processes after the fork() call?

#include <stdio.h>

void main() {

	int x = 5;
	fork();
	x = x+1;
	printf("x = %d\n",x);
}
