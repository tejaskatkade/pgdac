import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import { ROUTES } from '../constants/RoutesConstants';
import {LinkContainer} from 'react-router-bootstrap';
import { Routes } from 'react-router-dom';


export function Header() {

    return (
        <>
            <Navbar bg="dark" data-bs-theme="dark">
                <Container>
                    <LinkContainer to={ROUTES.HOME}>
                        <Navbar.Brand to={ROUTES.HOME}>Task Manager</Navbar.Brand>
                    </LinkContainer>
                    <Nav className="me-auto">
                        <LinkContainer to={ROUTES.GET_TASK}>
                        <Nav.Link >View Task</Nav.Link>
                        </LinkContainer>
                        
                        <LinkContainer to={ROUTES.ADD_TASK}>
                        <Nav.Link >Add Task</Nav.Link>
                        </LinkContainer>
                        
                        <LinkContainer to={ROUTES.UPDATE_TASK}>
                        <Nav.Link >Edit</Nav.Link>
                        </LinkContainer>
                    </Nav>
                </Container>
            </Navbar>
        </>
    )

}