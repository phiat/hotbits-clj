(ns hotbits.core)


;;  hotbits server address with params
(def hotbits-server "https://www.fourmilab.ch/cgi-bin/Hotbits?")
(def default-nbytes 128)
(def default-fmt "hex")
(def default-npass 1)
(def default-lpass 8)
(def default-pwtype 3)

;;	?nbytes=128&fmt=hex&npass=1&lpass=8&pwtype=3")

;;  page returns bits on lines 14-18
(def bits-begin 14)
(def bits-end 18)

;;  page request
(defn request-bits 
	"requests page from hotbits server"
	[nbytes fmt npass lpass pwtype] 
	(let [req  (format "?nbytes=%d&fmt=%s&npass=%d&lpass=%dpwtype=%d" nbytes fmt npass lpass pwtype)]
		(slurp (apply str hotbits-server req))))

(defn parse-bits 
	"takes a hotbits server result (html) and parses the bits out of the <pre> tag... hacky"
	[res]
	(let [	pre-regexp #"pre"
			regexp #"\<|\>|\/|\n"
	      	replacement-map {">" "" "<" "" "/" "" "\n" ""}]
	(clojure.string/replace 
		(second 
			(clojure.string/split res pre-regexp)) 
		regexp 
		replacement-map)))

;; our hotbits
(defn hotbits 
	"returns a string of format fmt (hex default) and length len (256 default)"
	[] 
	(parse-bits (request-bits default-nbytes default-fmt default-npass default-lpass default-pwtype)))
