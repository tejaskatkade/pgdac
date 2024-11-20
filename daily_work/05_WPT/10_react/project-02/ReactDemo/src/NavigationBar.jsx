import { Link } from "react-router-dom"
export function NavigationBar() {
    return (
        <>
            <div>
                <div>
                    <Link to={"/"}>Home</Link>
                </div>
                <div>
                    <Link to={"/about"}>about</Link>
                </div>
                <div>
                    <Link to={"/contact"}>Contact</Link>
                </div>
            </div>
        </>
    )
}