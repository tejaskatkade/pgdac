//import {sum,square} from './utility'
//SyntaxError: Cannot use import statement outside a module 
// by default node js works common js
// so in package.json we need to add specify the standard  
// "type": "commomjs" <---- common js (default value)
// "type": "module"   <---- ES 

// after adding type in package.json
// import {sum,square} from './utility.js'

// const x = square(4);
// const y = sum(4,4);

// console.table([x,y]);


// to import entire module
 //import {mydata} from './utility.js'
 
 // module imported in util reference
 
 //console.log(mydata);
 
import * as util from './utility.js';

let s1 = util.square(5);
let s2 = util.sum(5,2);
//let s3 = util.arr;
console.log(s1);
console.log(s2);
console.log(util.arr[1]);