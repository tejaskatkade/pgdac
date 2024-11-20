import { Component } from "react";


export class RegistrationForm extends Component{
    constructor(){
        super();
        this.state ={
            formData : {
                firstname: "" ,
                lastname: "" ,
                email: "" ,
                password: ""
            }
        }
        /*
        this.handleSubmit = this.handleSubmit.bind(this);
        this.handleFirstNameChange = this.handleFirstNameChange.bind(this);
        this.handleLastNameChange = this.handleLastNameChange.bind(this);
        this.handleEmailChange = this.handleEmailChange.bind(this);
        this.handlePasswordChange = this.handlePasswordChange.bind(this);
        */
       this.handleSubmit = this.handleSubmit.bind(this);
       this.handleInputChange = this.handleInputChange.bind(this);
    }

    /*
    handleFirstNameChange(e){   //e -> event object on which is occured on particular elemet
        console.log(e.target.value);
        this.setState({
            formData : {
                ...this.state.formData,
                firstname : e.target.value
              }});
    }

    handleLastNameChange(e){   //e -> event object on which is occured on particular elemet
        console.log(e.target.value);
        this.setState({
            formData : {
                ...this.state.formData,
                lastname : e.target.value
              }});
    }
    handleEmailChange(e){   //e -> event object on which is occured on particular elemet
        console.log(e.target.value);
        this.setState({
            formData : {
                ...this.state.formData,
                email : e.target.value
              }});
    }
    handlePasswordChange(e){   //e -> event object on which is occured on particular elemet
        console.log(e.target.value);
        this.setState({
            formData : {
                ...this.state.formData,
                password : e.target.value
              }});
    }

    */
    handleSubmit(e){
        e.preventDefault();
        console.log(this.state.formData);
    }
    
    handleInputChange(e){
        e.preventDefault();
        console.log(this.state.formData);
    }

    /*
    render(){

        return(
            <div>
                <form action="" onSubmit={this.handleSubmit}>
                    <input type="text" placeholder="Enter Firstname" onChange={this.handleFirstNameChange} />
                    <input type="text" placeholder="Enter Lastname" onChange={this.handleLastNameChange} />
                    <input type="text" placeholder="Enter Email" onChange={this.handleEmailChange} />
                    <input type="text" placeholder="Enter Password" onChange={this.handlePasswordChange} />
                    <button type="submit">Register</button>

                </form>
            </div>
        )
    }
    */

   

    render(){

        return(
            <div>
                <form action="" onSubmit={this.handleSubmit}>
                    <input type="text" name="firstname" placeholder="Enter Firstname" onChange={this.handleFirstNameChange} />
                    <input type="text" name="lastname" placeholder="Enter Lastname" onChange={this.handleLastNameChange} />
                    <input type="text" name="email" placeholder="Enter Email" onChange={this.handleEmailChange} />
                    <input type="text" name="password" placeholder="Enter Password" onChange={this.handlePasswordChange} />
                    <button type="submit">Register</button>

                </form>
            </div>
        )
    }

}