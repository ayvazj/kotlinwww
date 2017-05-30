# A working example of Javascript with Kotlib

## Building the project

    npm run build

**The npm task runs gradle**
    
## Running the project

    open dist/index.html

## Adding Typescript typings to Kotlin

* Install ts2kt

    npm install --save ts2kt
    npm link ts2kt
    
* Install the typing for your Javascript library (ex: jquery)

    npm install --save @types/jquery

* Generate the kt files

    mkdir -p src/main/kotlin/include/jquery
    ts2kt -d src/main/kotlin/include/jquery node_modules/\@types/jquery/index.d.ts 
