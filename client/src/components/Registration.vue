<template>
    <main class="main-content">
        <form class="registration-form">
            <h1 class="registration-form__title">Student Registration Form</h1>
            <p class="registration-form__subtitle">Fill out the form carefully for registration</p>
            <div class="student-name">
                <h4 class="student-name__title">Student Name</h4>
                <div class="student-name__blocks">
                    <div>
                        <input id="firstName" class="firstName" name="firstName" type="text" v-model="student.firstName">
                        <label for="firstName">First Name</label>
                    </div>
                    <div>
                        <input id="middleName" class="middleName" name="middleName" type="text" v-model="student.middleName">
                        <label for="middleName">Middle Name</label>
                    </div>
                    <div>
                        <input id="lastName" class="lastName" name="lastName" type="text" v-model="student.lastName">
                        <label for="lastName">Last Name</label>
                    </div>
                </div>
            </div>

            <div class="birthday">
                <h4 class="birthday__title">Birth Date</h4>
                <div class="birthday__blocks">
                    <div>
                        <select name="birthday" id="birthday" class="birthday__select" v-model="student.month">
                            <option value=""></option>
                            <option value="0">January</option>
                            <option value="1">February</option>
                            <option value="2">March</option>
                            <option value="3">April</option>
                            <option value="4">May</option>
                            <option value="5">June</option>
                            <option value="6">July</option>
                            <option value="7">August</option>
                            <option value="8">September</option>
                            <option value="9">October</option>
                            <option value="10">November</option>
                            <option value="11">December</option>
                        </select>
                        <label for="birthday">Month</label>
                    </div>
                    <div>
                        <select name="day" id="day" v-model="student.day">
                            <option value=""></option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                            <option value="7">7</option>
                            <option value="8">8</option>
                            <option value="9">9</option>
                            <option value="10">10</option>
                            <option value="11">11</option>
                            <option value="12">12</option>
                            <option value="13">13</option>
                            <option value="14">14</option>
                            <option value="15">15</option>
                            <option value="16">16</option>
                            <option value="17">17</option>
                            <option value="18">18</option>
                            <option value="19">19</option>
                            <option value="20">20</option>
                            <option value="21">21</option>
                            <option value="22">22</option>
                            <option value="23">23</option>
                            <option value="24">24</option>
                            <option value="25">25</option>
                            <option value="26">26</option>
                            <option value="27">27</option>
                            <option value="28">28</option>
                            <option value="29">29</option>
                            <option value="30">30</option>
                            <option value="31">31</option>
                        </select>
                        <label for="day">Day</label>
                    </div>
                    <div>
                        <select name="year" id="year" v-model="student.year">
                            <option value=""></option>
                            <option value="1992">1992</option>
                            <option value="1993">1993</option>
                            <option value="1994">1994</option>
                            <option value="1995">1995</option>
                            <option value="1996">1996</option>
                            <option value="1997">1997</option>
                            <option value="1998">1998</option>
                            <option value="1999">1999</option>
                            <option value="2000">2000</option>
                            <option value="2001">2001</option>
                            <option value="2002">2002</option>
                            <option value="2003">2003</option>
                            <option value="2004">2004</option>
                            <option value="2005">2005</option>
                            <option value="2006">2006</option>
                            <option value="2007">2007</option>
                            <option value="2008">2008</option>
                            <option value="2009">2009</option>
                        </select>
                        <label for="year">Year</label>
                    </div>
                </div>
            </div>
            <div class="gender">
                <h4 class="gender__title">Gender</h4>
                <select  v-model="student.gender">
                    <option value=""></option>
                    <option value="MALE">Male</option>
                    <option value="FEMALE">Female</option>
                    <option value="N/A">N/A</option>
                </select>
            </div>

            <div class="address">
                <h4 class="address__title">Address</h4>
                <div class="street-address-block address__block">
                    <input id="street-address" name="street-address" type="text" v-model="student.streetAddress">
                    <label for="street-address">Street Address</label>
                </div>
                <div class="street-address-two-block address__block">
                    <input id="street-address-two" name="street-address-two" type="text" v-model="student.streetAddressLineTwo">
                    <label for="street-address-two">Street Address Line 2</label>
                </div>
                <div class="first-location-block address__block">
                    <div class="city-block">
                        <input id="city" name="city" type="text" v-model="student.city">
                        <label for="city">City</label>
                    </div>
                    <div class="state-block">
                        <input id="state" name="city" type="text" v-model="student.state">
                        <label for="state">State/Province</label>
                    </div>
                </div>
                <div class="second-location-block address__block">
                    <div class="zip-block">
                        <input id="zip" name="city" type="text" v-model="student.zip">
                        <label for="zip">Postal/Zip Code</label>
                    </div>
                    <div class="country-block">
                        <select id="country" v-model="student.country">
                            <option value="">Please Select</option>
                            <option value="Afghanistan">Afghanistan</option>
                            <option value="Albania">Albania</option>
                            <option value="Algeria">Algeria</option>
                            <option value="American Samoa">American Samoa</option>
                            <option value="Andorra">Andorra</option>
                            <option value="Angola">Angola</option>
                            <option value="Anguilla">Anguilla</option>
                            <option value="Antarctica">Antarctica</option>
                            <option value="Antigua and Barbuda">Antigua and Barbuda</option>
                            <option value="Argentina">Argentina</option>
                            <option value="Armenia">Armenia</option>
                            <option value="Aruba">Aruba</option>
                            <option value="Australia">Australia</option>
                            <option value="Austria">Austria</option>
                            <option value="Azerbaijan">Azerbaijan</option>
                            <option value="Bahamas">Bahamas</option>
                            <option value="Bahrain">Bahrain</option>
                            <option value="Bangladesh">Bangladesh</option>
                            <option value="Barbados">Barbados</option>
                            <option value="Belarus">Belarus</option>
                            <option value="Belgium">Belgium</option>
                            <option value="Belize">Belize</option>
                            <option value="Benin">Benin</option>
                            <option value="Bermuda">Bermuda</option>
                            <option value="Bhutan">Bhutan</option>
                            <option value="Bolivia">Bolivia</option>
                            <option value="Bosnia and Herzegovina">Bosnia and Herzegovina</option>
                            <option value="Botswana">Botswana</option>
                            <option value="Bouvet Island">Bouvet Island</option>
                            <option value="Brazil">Brazil</option>
                            <option value="British Indian Ocean Territory">British Indian Ocean Territory</option>
                            <option value="Brunei Darussalam">Brunei Darussalam</option>
                        </select>
                        <label for="country">Country</label>
                    </div>
                </div>
            </div>

            <div class="courses">
                <h4 class="courses__title">Courses</h4>
                <select v-model="student.course">
                    <option value=""></option>
                    <option value="Windows 8">Windows 8</option>
                    <option value="Introduction to Linux">Introduction to Linux</option>
                    <option value="English 101">English 101</option>
                    <option value="English 102">English 102</option>
                    <option value="Creative Writing 101">Creative Writing 101</option>
                    <option value="Creative Writing 102">Creative Writing 102</option>
                    <option value="History 101">History 101</option>
                    <option value="History 102">History 102</option>
                    <option value="Math 101">Math 101</option>
                    <option value="Math 102">Math 102</option>
                </select>
            </div>

            <div class="additional-comments">
                <h4 class="additional-comments__title">Additional Comments</h4>
                <textarea class="additional-comments__textarea" v-model="student.additionalComments"></textarea>
            </div>

            <div class="submit-buttons">
                <button class="submit-button" @click="registration">Submit Application</button>
                <button class="clear-button">Clear Fields</button>
            </div>
        </form>
    </main>
</template>

<script>
    export default {
        data() {
            return {
                student: {
                    firstName: '',
                    middleName: '',
                    lastName: '',
                    gender: '',
                    streetAddress: '',
                    streetAddressLineTwo: '',
                    city: '',
                    state: '',
                    zip: '',
                    country: '',
                    course: '',
                    additionalComments: '',
                    birthday: '',
                }
            }
        },
        methods: {
            registration: function (e) {
                console.log('hello');
                e.preventDefault();
                fetch('http://localhost:9000/registration', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify(this.student)
                })
            }
        }
    }
</script>

<style scoped>
    * {
        box-sizing: border-box;
        margin: 0;
        padding: 0;
    }

    input, select {
        height: 25px;
    }

    .registration-form {
        max-width: 700px;
        margin: 0 auto;
        background-color: #d4d3d3;
        padding: 30px;
    }

    .student-name {
        margin-top: 30px;
    }

    .student-name__title {
        margin-bottom: 10px;
    }

    .student-name__blocks {
        display: flex;
    }

    .student-name__blocks div:not(:last-child) {
        margin-right: 10px;
    }

    .birthday {
        margin-top: 30px;
    }

    .birthday__title {
        margin-bottom: 10px;
    }

    .birthday__blocks div:not(:last-child) {
        margin-right: 10px;
    }

    .student-name__blocks div {
        display: flex;
        flex-direction: column;
    }

    .birthday {
        display: flex;
        flex-direction: column;
    }

    .birthday__select {
        width: 100px;
    }

    .birthday__blocks {
        display: flex;
    }

    .birthday__blocks div {
        display: flex;
        flex-direction: column;
    }

    .gender {
        margin-top: 30px;
    }

    .gender__title {
        margin-bottom: 10px;
    }

    .address {
        margin-top: 30px;
    }

    .address__block {
        margin-top: 15px;
    }

    .street-address-block, .street-address-two-block {
        display: flex;
        flex-direction: column;
    }

    .first-location-block, .second-location-block {
        display: flex;
    }

    .city-block, .state-block, .zip-block, .country-block {
        display: flex;
        flex-direction: column;
    }

    .city-block, .zip-block {
        margin-right: 15px;
    }

    .courses {
        margin-top: 30px;
    }

    .courses__title {
        margin-bottom: 10px;
    }

    .additional-comments {
        margin-top: 30px;
    }

    .additional-comments__title {
        margin-bottom: 10px;
    }

    .additional-comments__textarea {
        width: 400px;
        height: 100px;
    }

    .submit-buttons {
        margin-top: 30px;
    }

    .submit-button {
        margin-right: 70px;
        width: 150px;
        height: 40px;
    }

    .clear-button {
        width: 110px;
        height: 40px;
    }

    .street-address-block, .street-address-two-block {
        width: 400px;
    }

</style>
