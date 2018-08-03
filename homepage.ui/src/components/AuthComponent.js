import React from 'react';
import { getJwt } from '../jwt';
import axios from 'axios';

class AuthComponent extends React.Component {
    constructor(props) {
        super(props);

        this.state = {
            user:undefined
        }
    }

    componentDidMount() {
        const jwt = getJwt();

        axios.get('/getUser', { headers: { Authorization: `Bearer ${jwt}` } }).then(res => res.setState({
            user: res.data
        }));
    }

    render() {
        return (
            <div>
                {this.props.children}
            </div>
        )
    }
}

export default AuthComponent;