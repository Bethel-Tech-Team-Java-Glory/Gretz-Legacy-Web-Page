import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter as Router, Route } from 'react-router-dom';
import { Home } from './screens';
import './index.css';

import { createStore }  from 'redux';
import { Provider } from 'react-redux'
import reducer from './reducers/reducer';

const Index = ({store}) => (
    <Provider store={store}>
        <Router>
            <div>
                <Route exact path="/" component={Home} />
            </div>
        </Router>
    </Provider>
);

ReactDOM.render(
    <Index store={createStore(reducer)} />, 
    document.getElementById('root')
);
