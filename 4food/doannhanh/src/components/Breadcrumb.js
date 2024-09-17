import React from 'react';

const Breadcrumb = () => {
  return (
    <section className="breadscrumb-section pt-0">
      <div className="container-fluid-lg">
        <div className="row">
          <div className="col-12">
            <div className="breadscrumb-contain">
              <h2>Sign In</h2>
              <nav>
                <ol className="breadcrumb mb-0">
                  <li className="breadcrumb-item">
                    <a href="index.html">
                      <i className="fa-solid fa-house"></i>
                    </a>
                  </li>
                  <li className="breadcrumb-item active">Sign In</li>
                </ol>
              </nav>
            </div>
          </div>
        </div>
      </div>
    </section>
  );
};

export default Breadcrumb;
