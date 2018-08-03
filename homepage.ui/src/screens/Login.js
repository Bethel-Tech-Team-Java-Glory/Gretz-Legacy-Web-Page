import React from 'react';
import axios from 'axios';

class Login extends React.Component {

    constructor(props){
        super(props);
        
        this.state={
        username:'',
        password:''
        };

        this.change = this.change.bind(this);
        this.submit = this.submit.bind(this);
    }

    change(e) {
        this.setState({
            [e.target.name]: e.target.value
        })
    }

    submit(e) {
        e.preventDefault();
        axios.post('/getuser', {
            username: this.state.username,
            password: this.state.password
        }).then(res => localStorage.setItem('cool-jwt', res.data))
    }

    render() {
        return (
            <div>
            <form onSubmit={e => this.submit(e)}>
                <h3>Log in</h3>
                <label>Username</label><input type="text" name="username" onChange={e => this.change(e)} value={this.state.username} />
                <label>Password</label><input type="password" name="password" onChange={e => this.change(e)} value={this.state.password}/>
                <input type="submit" value="Login" />
            </form>
            </div>
        )
    }
}

export default Login;