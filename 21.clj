(defn reachN [arr n]
	(
		if (= n 0) 
		(first arr) 
		(recur (rest arr) (- n 1))
	)	
)

#(first (drop %2 %))

