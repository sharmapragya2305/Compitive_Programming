integer i = 1;
integer n = 10;
integer firstTerm = 0;
integer secondTerm = 1;
while(i<=n)
{
    system.debug(firstTerm);
     integer nextTerm = firstTerm + secondTerm;
     firstTerm = secondTerm;
     secondTerm = nextTerm;
     i++;
}
