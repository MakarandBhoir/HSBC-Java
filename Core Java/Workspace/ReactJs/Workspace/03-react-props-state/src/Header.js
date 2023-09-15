import PropTypes from 'prop-types';

function Header(props) {
    //alert(JSON.stringify(props));
    return (
        <div className="jumbotron">
            <h1 className="display-4">{props.title}</h1>
            <p>{props.description}</p>
            <p>{props.projectNumber + 3}</p>
        </div>
    )
}
export default Header;
Header.propTypes = {
    title: PropTypes.string.isRequired,
    description: PropTypes.string,
    projectNumber: PropTypes.number
}

Header.defaultProps = {
    title: "React Unknown Project",
    projectNumber: 1,
    description: "Project description will go here..."
}