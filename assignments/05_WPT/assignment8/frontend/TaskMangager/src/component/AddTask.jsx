import FloatingLabel from 'react-bootstrap/FloatingLabel';
import Form from 'react-bootstrap/Form';
import { Container } from 'react-bootstrap';
import Button from 'react-bootstrap/Button';
import { useState } from 'react';

export function AddTask() {
    const [formData, setFormData] = useState({
        title:"",
        description:"",
        priority:"",
        due_date:"",
    });
 
    const handleInputChange = (e)=>{
        setFormData({
            ...formData,
            [e.target.name]:e.target.value
        })
        console.log(formData);
        
    }

    const handleSubmit = ()=>{
        console.log(formData);
        
    }


    return (
        <Container className='p-2 mt-5 boarder-2' style={{
            backgroundColor: "#ffb8b8",
            textAlign: 'center',
            width: '60%',
            borderRadius: '20px'
        }}>

            <h1 className='pt-3'>Add Task</h1>
            <form action="">

                <FloatingLabel
                    controlId="title"
                    label="Title"
                    className="m-5"
                >
                    <Form.Control name='title' type="text" placeholder="title" onChange={handleInputChange} />

                </FloatingLabel>

                <FloatingLabel
                    controlId="description"
                    label="Description"
                    className=" m-5"
                >
                    <Form.Control name='description' as="textarea" placeholder="describe your task" onChange={handleInputChange}/>
                </FloatingLabel>

                <Form.Select size="lg" style={{ width: '85%' }} className='m-5' defaultValue="" onChange={handleInputChange}>
                    <option value={""} disabled >Priority</option>
                    <option value={"High"}>High</option>
                    <option value={"High"}>Medium</option>
                    <option value={"Low"}>Low</option>
                </Form.Select>

                <FloatingLabel
                    controlId="due_date"
                    label="Due Date"
                    className="m-5"
                >
                    <Form.Control type="date" placeholder="title" onChange={handleInputChange} />

                </FloatingLabel>

                {/* <Form.Select size="lg" style={{ width: 407 }} className='m-5' defaultValue="">
            <option value={""} disabled >Status</option>
            <option value={"High"}>Pending</option>
            <option value={"High"}>In Progress</option>
            <option value={"Low"}>Completed</option>
        </Form.Select> */}

                <Button onClick={handleSubmit} className='m-1' variant="dark" size="lg">Add</Button>
                {/* <Button className='m-1' type="reset" variant="dark" size="lg">Cancle</Button> */}
            </form>
        </Container>


    )
}