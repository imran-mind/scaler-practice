

function fullNumericPyramid(n){
    let pattern = "";
    let v = 1;
    for(let i=1; i<=n; i++){

        for(let j=n; j>i; j--){
            pattern = pattern + "0 ";
        }

        for(let k=1; k<=i; k++){
            pattern = pattern + v+" ";
            v++;
        }
        if(i>1){
            v = v - 2;
            for(let m=1; m<=i-1; m++){
                pattern = pattern + v+" ";
                v--;
            }
        }
        for(let j=1; j<=n-i; j++){
            pattern = pattern + "0 ";
        }
        pattern = pattern + "\n";
        // console.log("v ->",v)
        v = i + 1;
        // console.log("v -> a",v)
    }
    console.log(pattern);
}

fullNumericPyramid(5);