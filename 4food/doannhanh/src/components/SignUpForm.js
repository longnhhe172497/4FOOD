import React from 'react';

const SignUpForm = () => {
  return (
    <section className="log-in-section section-b-space">
      <div className="container-fluid-lg w-100">
        <div className="row">
          <div className="col-xxl-6 col-xl-5 col-lg-6 d-lg-block d-none ms-auto">
            <div className="image-contain">
              <img
                src="../assets/images/inner-page/sign-up.png"
                className="img-fluid"
                alt="Sign Up"
              />
            </div>
          </div>

          <div className="col-xxl-4 col-xl-5 col-lg-6 col-sm-8 mx-auto">
            <div className="log-in-box">
              <div className="log-in-title">
                <h3>Welcome To 4FOOD</h3>
                <h4>Create New Account</h4>
              </div>

              <div className="input-box">
                <form className="row g-4">
                  <div className="col-12">
                    <div className="form-floating theme-form-floating">
                      <input
                        type="text"
                        className="form-control"
                        id="fullname"
                        placeholder="Full Name"
                      />
                      <label htmlFor="fullname">Full Name</label>
                    </div>
                  </div>
                  <div className="col-12">
                    <div className="form-floating theme-form-floating">
                      <input
                        type="email"
                        className="form-control"
                        id="email"
                        placeholder="Email Address"
                      />
                      <label htmlFor="email">Email Address</label>
                    </div>
                  </div>

                  <div className="col-12">
                    <div className="form-floating theme-form-floating">
                      <input
                        type="password"
                        className="form-control"
                        id="password"
                        placeholder="Password"
                      />
                      <label htmlFor="password">Password</label>
                    </div>
                  </div>

                  <div className="col-12">
                    <div className="forgot-box">
                      <div className="form-check ps-0 m-0 remember-box">
                        <input
                          className="checkbox_animated check-box"
                          type="checkbox"
                          id="flexCheckDefault"
                        />
                        <label className="form-check-label" htmlFor="flexCheckDefault">
                          I agree with <span>Terms</span> and <span>Privacy</span>
                        </label>
                      </div>
                    </div>
                  </div>

                  <div className="col-12">
                    <button className="btn btn-animation w-100" type="submit">
                      Sign Up
                    </button>
                  </div>
                </form>
              </div>

              <div className="other-log-in">
                <h6>or</h6>
              </div>

              <div className="log-in-button">
                <ul>
                  <li>
                    <a
                      href="https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin"
                      className="btn google-button w-100"
                    >
                      <img
                      
                        src="4food/doannhanh/src/image/kisspng-google-icon-1713874997698.webp"
                        className="blur-up lazyload"
                        alt="Google"
                      />
                      Sign up with Google
                    </a>
                  </li>
                  <li>
                    <a href="https://www.facebook.com/" className="btn google-button w-100">
                      <img
                        src="../assets/images/inner-page/facebook.png"
                        className="blur-up lazyload"
                        alt="Facebook"
                      />
                      Sign up with Facebook
                    </a>
                  </li>
                </ul>
              </div>

              <div className="sign-up-box">
                <h4>Already have an account?</h4>
                <a href="/SigninForm">Log In</a>
              </div>
            </div>
          </div>

          <div className="col-xxl-7 col-xl-6 col-lg-6"></div>
        </div>
      </div>
    </section>
  );
};

export default SignUpForm;
