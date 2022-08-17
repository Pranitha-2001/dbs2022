import React, {Component} from "react";

class Component2 extends Component {
    constructor(props) {
        super(props)
        this.state = {
            name : 'Allen'
        }
        console.log('Life Cycle 2 Constructor')

        }
        static getDerivedStateFromProps(props, state) {
            console.log('Life Cycle 2 getDerivedStateFromProps')
    }
    componentDidMount() {
        console.log('Life Cycle 2 componentDidAmount')
    }
    shouldComponentUpdate() {
        console.log('Life Cycle 2 shouldComponentUpdate')
    }
    getSnapshotBeforeUpdate(prevProps, prevState) {
        console.log('Life Cycle 2 Life Cycle 1 shouldComponentUpdate')
    }
    componentDidUpdate(prevProps, prevState,snapshot) {
        console.log('Life Cycle 2 ComponentDidUpdate')
    }
    changeState= () => {
        this.setState({
            name:'Black'
        })
    }
    render() {
        console.log('Life Cycle1 render')
        return(
            <div>
                <button onClick={this.changeState}>change State</button>
                Life Cycle 2
            </div>
        )
    }
}
export default Component2;