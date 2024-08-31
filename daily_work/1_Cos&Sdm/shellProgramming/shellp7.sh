a=0
sum=0
for a in 1 2 3 4 5 6 7 8 9 10
do
sum=`expr $sum + $a`
done
echo sum = $sum
