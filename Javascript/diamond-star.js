
function diamondStar(n){
    let upper = Math.round(n/2);
    let lower = Math.floor(n/2);
    let pattern = "";
    for(let row=1; row<=upper; row++){
        for(let space=row; space<= upper-1; space++){
            pattern = pattern + " ";
        }
        for(let star=1; star<= 2*row-1; star++){
            pattern = pattern + "*";
        }
        pattern = pattern + "\n";
    }

    for(let row=lower; row>=1; row--){
        for(let space=lower; space>=row; space--){
            pattern = pattern + " ";
        }
        for(let star =1; star<= 2*row-1; star++){
            pattern = pattern + "*";
        }
        pattern = pattern + "\n";
    }
    console.log(pattern)

}



diamondStar(5);
diamondStar(7);
diamondStar(9);