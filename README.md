Given a Hexadecimal number N, convert N into an equivalent decimal number i.e. convert the number with base value 16 to base value 10. The decimal number system uses 10 digits 0-9 and the Hexadecimal number system uses 0-9, A-F to represent any numeric value.

Illustration: 

Input : 1AB
Output: 427
Input : 1A
Output: 26
Approach to Convert Hexadecimal to Decimal Conversion
The approach to implementing the conversion is mentioned below:

The idea is to extract the digits of a given hexadecimal number starting from the rightmost digit.
Keep a variable ‘dec_value’. 
At the time of extracting digits from the hexadecimal number, multiply the digit with the proper base (Power of 16) and add it to the above variable taken that is ‘dec_value’. 
In the end, the variable ‘dec_value’ will store the required decimal number.
Java Program For Hexadecimal to Decimal Conversion
![image](https://github.com/230Souvik/Hexadecimal_to_Decimal/assets/135532224/14cf1d78-ad76-4a49-a7b3-c990a687b8a9)
