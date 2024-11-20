import { useEffect } from "react";

export function Home(){

    const [prod, setProd] =  useState([]);
    const getProducts = async () => {
        const data  = await getAllProducts();
        console.log(data);
        setProduct(data);
        
    }
    useEffect(()=>{
        
    },[]);
    return (
        <div>
            <h1> Welcome to Home </h1>

        </div>
    )
}