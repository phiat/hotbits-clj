# hotbits

A Clojure library designed to get real random bits from Hotbits (fourmilab.ch).  See http://www.fourmilab.ch/hotbits/ for more.


	                         _                                             
	                        ( )                                            
	  _ __   _ _   ___     _| |   _     ___ ___    ___     __    ___   ___ 
	 ( '__)/'_` )/' _ `\ /'_` | /'_`\ /' _ ` _ `\/' _ `\ /'__`\/',__)/',__)
	 | |  ( (_| || ( ) |( (_| |( (_) )| ( ) ( ) || ( ) |(  ___/\__, \\__, \
	 (_)  `\__,_)(_) (_)`\__,_)`\___/'(_) (_) (_)(_) (_)`\____)(____/(____/

## Usage

**WARNING: Use Sparingly! You will get errors if you exceed your 24-hour hotbits limit.**

you can also use the [RandomX](http://www.fourmilab.ch/hotbits/source/randomX/randomX.tar.gz)  package found at fourmilab's site.

add to leiningen dependecies:
```clojure
[hotbits-clj "0.2.1-SNAPSHOT"]
```

```clojure
(use 'hotbits.core)

(hotbits)
"0FBE803B97F925E9DDE63A20651CD5ACDA7AF73F3EB0D242085A6E19D8538053FF974005DA3D83B40ED42063B3268D449019889338BD0F939CC9E5782A3A5043D2B291CEDB9DB98205A6D2329CE986EEE387125D501E91E0C144E630CCA8552A7880E3205F5DF4C3D45335EE0CB517D4660BD97975195284119F206DEB392D1D"
```

## Todo

make less hacky and more user/server request friendly :)

## License

Copyright © 2013 Patrick Ryan

Distributed under the Eclipse Public License, the same as Clojure.
