import Redux from 'redux';

let initialState = {
    title: '',
    description: ''
}

const reducer = (state = initialState, action) => {
    switch(action.type) {
        default:
            return state;
    }
}

export default reducer;