/**
 
    1. Create a function called "fetchUser" that returns a Promise that resolves with the value:
       { data: {user: "Monkey", admin: true}}   after 3 seconds

    2. Create a function called "login" that takes an Object as an argument. If the object has a property called 
       "admin" with a value of true, then log out "sucessfully logged in!",
        otherwise log out "Failed to log in, please try again"

    3. Print out "Program starting...."

    4. Create an async function that uses await to wait for the data to comes back from "fetchUser".

    5. Pass the user that comes back from "fetchUser" to the "login" function your create above 
    
    6. Call the async function you created
    7. Log out "Program completed !!!"

 */


    const fetchUser = ()=>{
        return new Promise((resolve,reject)=>{
            setTimeout(()=>{
                resolve({ data: {user: "Monkey", admin: true}});
            },3000);
        });
    };


    const login = (obj)=>{
        //console.log(obj);
        if(obj.data.admin === true){
            
            console.log("sucessfully logged in!");
        }else{
            console.log("Failed to log in, please try again");
        }
    };


    console.log("Program starting....");
    
    const useAdmin = async ()=>{
        try {
            const user = await fetchUser();
            login(user);
        } catch (error) {
            
        }
    }

    useAdmin();
    console.log("Program completed");
    