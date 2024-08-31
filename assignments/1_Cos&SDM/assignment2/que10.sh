for i in {1..10}
do
	for j in {1..5}
	do
		echo -n -e `expr $i \* $j` '\t'
		
	done
	echo

done
