import PropTypes from 'prop-types';

function Header({ title, description }) {
    return (
        <div className="jumbotron">
            <h1 className="display-4">{title}</h1>
            <p>{description}</p>
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