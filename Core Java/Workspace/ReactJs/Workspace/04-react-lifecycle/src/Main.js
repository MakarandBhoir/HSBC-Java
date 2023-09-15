import React from 'react'

class Main extends React.Component {
    constructor() {
        super();
        this.state = { counter: 0 };
        console.log('constructor')
    }
    render() {
        console.log('render')
        return (
            <div>
                <button className='btn btn-primary mx-4' onClick={() => this.setState({ counter: this.state.counter + 1 })}>+</button>
                <label>{this.state.counter}</label>
                <button className='btn btn-primary mx-4' onClick={() => this.setState({ counter: this.state.counter - 1 })}>-</button>
            </div>
        )
    }
    componentDidMount() {
        console.log('componentDidMount')
    }
    componentDidUpdate() {
        console.log('componentDidUpdate')
    }
    componentWillUnmount() {
        console.log('componentWillUnmount')
    }
}

export default Main;