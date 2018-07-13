import React from 'react';
import {connect} from 'react-redux';
import axios from 'axios';

class Home extends React.Component {
    state = {}
    
    componentDidMount() {
        axios.get('').then((res) => {
            this.setState({
                title: res.data.title,
                description: res.data.description
            })
        }).catch((err) => {
            console.log(err)
        })
    }


    render() {
        return (
            <div>
                <h1>{this.state.title}</h1>
                <p>{this.state.description}</p>
            </div>
        );
    }
}

const mapStateToProps = (state) => {
    return {
        title: state.title,
        description: state.description
    }
}


export default connect(mapStateToProps)(Home);