# !/bin/bash

awk -F " " '
	BEGIN {
		firstLine = 1;
	}

	{
		if (firstLine == 1) {
			endTime = $1;
			firstLine = 0;
		}
		tmp = $1 - endTime;
		printf("%.1f %s %.0f %.0f %s\n", tmp, $2, $3, $4, $5);
	}

	END {
	}

' times=$i $1
