import { useState } from 'react'
import { Button, Col, Container, Navbar, Row } from 'react-bootstrap'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div>
        <Navbar></Navbar>
        <Container>
            <Row>
              <Col lg={6} >
                <h1> First Section</h1>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Optio, tenetur tempora consequatur sit dolores, rem maiores laudantium distinctio aliquid nisi voluptate ea? Odit voluptatem obcaecati quasi doloremque temporibus quae quia.</p>
                <Button variant="primary">Click Me</Button>
              </Col>
              
              <Col lg={6} >
                <h1> First Section</h1>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Optio, tenetur tempora consequatur sit dolores, rem maiores laudantium distinctio aliquid nisi voluptate ea? Odit voluptatem obcaecati quasi doloremque temporibus quae quia.</p>
                <Button variant="secondary">Click Me</Button>
              </Col>
            </Row>
        </Container>
      </div>
    </>
  )
}

export default App
