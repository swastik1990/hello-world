#include <stdio.h>
#include <string.h>

int main() {
   char msg1[10] = "hello, ";
   char msg2[10] = "world!";
   
   // Concatenate the strings
   strcat(msg1, msg2);
   
   // printf() displays the string inside quotation
   printf("%s\n",msg1);
   return 0;
}
