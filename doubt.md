In this doubt portion i will clear your any doubt about how the Lcm and Gcd code is written and for that i will demonstrate an example as well

The GCD (LCM) of more than two numbers can also be found easily. For this, first compute the GCD (LCM) of the first two numbers. Suppose, the result comes to be a1. Then, compute the GCD (LCM) of a1 and the third number. This process may be repeated till all the numbers are exhausted. Finally, the desired GCD (LCM) will be obtained.

Example:- Find the GCD, and LCM of 12, 27 and 9.
Solution:- 
First, we find the GCD of 12 and 27 as follows:
GCD(12, 27) = GCD(27, 12)
            = GCD(12, 3)
            = GCD(3, 0)
            = 3

Then, we find the GCD of 3 and 9 as follows:
GCD(3, 9) = GCD(9, 3)
          = GCD(3, 0)
          = 3

Now, let us find the LCM of the above three numbers. First, we find the LCM of 12 and 27 as follows:
LCM(12, 27) = 12*27/GCD(12, 27)
            = 12*27/3
            = 108

Then, we find the LCM of 108 and 9 as follows:
LCM(108, 9) = 108*9/GCD(108, 9)
            = 108*9/GCD(9, 0)
            = 108*9/9
            = 108

So, GCD and LCM of 12, 27 and 9 are 3 and 108 respectively.
The readers can write programs to find the GCD and LCM of more than two numbers, themselves.

####///// NoCopyright© Taken this content from the Discrete Maths book by CL Liu and DP Mohapatra \\\\\#### 
