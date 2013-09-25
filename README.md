# hotbits

A Clojure library designed to get real random bits from Hotbits (fourmilab.ch).  See http://www.fourmilab.ch/hotbits/ for more.

## Usage

user=> (use 'hotbits.core)

user=> (hotbits)
>"0FBE803B97F925E9DDE63A20651CD5ACDA7AF73F3EB0D242085A6E19D8538053FF974005DA3D83B40ED42063B3268D449019889338BD0F939CC9E5782A3A5043D2B291CEDB9DB98205A6D2329CE986EEE387125D501E91E0C144E630CCA8552A7880E3205F5DF4C3D45335EE0CB517D4660BD97975195284119F206DEB392D1D"

## Todo

- add options for changing parameters ( nbytes=128
										&fmt=hex
										&npass=1
										&lpass=8
										&pwtype=3 )

## License

Copyright © 2013 Patrick Ryan

Distributed under the Eclipse Public License, the same as Clojure.
