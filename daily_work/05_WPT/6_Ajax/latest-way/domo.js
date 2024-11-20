

const fetchData = async ()=>{
    try {
        const response = await fetch("https://jsonplaceholder.typicode.com/posts");
        console.log(response);
        const users = await response.json();
        console.log(users);
        
    } catch (error) {
        console.log(error);
        
    }
}
fetchData();