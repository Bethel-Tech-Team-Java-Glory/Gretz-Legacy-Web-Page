import React from 'react';
import Header from '../components/Header';
import axios from 'axios';

class Home extends React.Component {
    render() {
        return (
            <div>
                <Header />
                <p>This is the home page</p>
            </div>
        );
    }
}

export default Home;