
function invertedNumericPyramid(n){
    let p = "";
    for(let i=n; i>0;i--){ // 4 3 2 1
        let v = 1;
        for(let j=1; j<=i; j++){
            p = p + v+" ";
            v++;
        }
        p = p + "\n";
    }
    console.log(p);
}

invertedNumericPyramid(4)