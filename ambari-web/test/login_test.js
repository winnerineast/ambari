/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

var App = require('app');

require('controllers/login_controller');

describe('App.LoginController', function () {

  var loginController = App.LoginController.create();

  describe('#validateCredentials()', function () {
    /*
    it('should return undefined if no username is present', function () {
      loginController.set('loginName', '');
      expect(loginController.validateCredentials()).to.equal(undefined);
    })
    it('should return undefined if no password is present', function () {
      loginController.set('password', '');
      expect(loginController.validateCredentials()).to.equal(undefined);
    })
    it('should return the user object with the specified username and password (dummy until actual integration)', function () {
      loginController.set('loginName', 'admin');
      loginController.set('password', 'admin');
      expect(loginController.validateCredentials().get('loginName'), 'admin');
    })
    */
  })
})
