# !/bin/bash

for i in `seq 0 100`
do

	awk -F " " '
		BEGIN {
			firstLine = 1;
		}

		{
			if (firstLine == 1) {
				endTime = $2*times;
				firstLine = 0;
			}
			else {
				if (times == 0) tmp = $1;
				else tmp = endTime + $1 + 1;
				printf("%.1f %.0f %f %f\n", tmp, $2, $3, $4);
			}
		}

		END {
		}

	' times=$i $1

done
