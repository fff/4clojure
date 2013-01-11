

(= 
	(
	#(
		(fn total [arr ahead]
		(if (empty? arr) ahead 
			(total (rest arr) (inc ahead))
			)
		)
   	 % 0
	)
	 '(13)) 1)



(#(
	(fn [arr cnt]
	(if(empty? arr) cnt
	(recur (rest arr) (+ 1 cnt)))
	)
	 % 0)
[1 2 3])


//with reduce
#(reduce (fn [cnt arr] (inc cnt)) 0 %)


