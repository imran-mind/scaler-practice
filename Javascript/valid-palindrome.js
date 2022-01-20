
function isAlphaNumeric(s){
    let reg = /^[a-zA-Z0-9]*$/;
    return s != null && reg.test(s);
}

function getCompressedString(s){
    let st = "";
    for(let i=0; i<s.length;i++){
        if(isAlphaNumeric(s[i])){
            st = st + s[i];
        }
    }
    return st.toLocaleLowerCase();
}
function reverseString(s){
    let r = "";
    for(let i=s.length-1; i>=0; i--){
        r = r + s[i];
    }
    return r;
}
function isValidPalindrome(s){
    const originalStr = getCompressedString(s);
    const reverseStr = reverseString(originalStr);
    if(originalStr === reverseStr){
        console.log("String is palindrome")
    }else{
        console.log("String is not palindrome")
    }

}

isValidPalindrome("A man, a plan, a canal: Panama")