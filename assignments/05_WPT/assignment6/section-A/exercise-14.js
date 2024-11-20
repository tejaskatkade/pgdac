// 14. Question: Use async/await to fetch data from a public API and log it to the console.


async function fetchData(){
    var postData = await fetch("https://jsonplaceholder.typicode.com/posts");
    console.log(postData);
    var data = await postData.json();
    console.log(data);
}

fetchData();