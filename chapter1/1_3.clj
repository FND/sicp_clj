(defn sum-largest-squares [a b c]

    (let [max1 (if (> a b) a b)
            min (if (< a b) a b)
            max2 (if (> min c) min c)]

        (+ (* max1 max1) (* max2 max2))))

(prn (sum-largest-squares 5 7 11))
(prn (sum-largest-squares 5 11 7))
(prn (sum-largest-squares 7 5 11))
(prn (sum-largest-squares 7 11 5))
(prn (sum-largest-squares 11 5 7))
(prn (sum-largest-squares 11 7 5))
