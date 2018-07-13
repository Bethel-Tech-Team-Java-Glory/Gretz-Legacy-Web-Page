import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

import { createStore}  from 'redux';
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
    <Index store={createrStore(reducer)} />, 
    document.getElementById('root')
);
