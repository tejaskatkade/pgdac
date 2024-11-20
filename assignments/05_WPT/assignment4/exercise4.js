// Exercise 4:
// Modify fetchData from Exercise 3 to include error handling.
// Requirements:
// ● Call the callback with an error message if an error occurs; otherwise, pass
// the “response.”
// ● Handle the error gracefully by logging it if it occurs



function fetchData(url,fun){
    setTimeout((()=>{
        if(!url){
            fun("error");
        }else{
            fun(url);
        }
    }),2000);
}

fetchData("https://www.google.com",(url)=>{
    console.log(url); 
});
