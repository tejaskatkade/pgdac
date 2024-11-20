


import { Alert, Container } from "react-bootstrap";

export function Home(){
    return (
        <Container className="mt-4">
            <Alert>
                Welcome to Task Manager
            </Alert>
            <h1>Manage Your Task</h1>
        </Container>
    )
}