# coding: utf-8

"""
    Kadaster - BRK-Bevragen API

    D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie.   # noqa: E501

    The version of the OpenAPI document: 1.3.0
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from openapi_client.configuration import Configuration


class ZakelijkGerechtigde(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'identificatie': 'str',
        'type': 'TypeGerechtigdeEnum',
        'aanvangsdatum': 'date',
        'erfpacht_canon': 'ErfpachtCanon',
        'tenaamstelling': 'Tenaamstelling',
        'persoon': 'PersoonBeperkt',
        'stuk_identificaties': 'list[str]',
        'is_gebaseerd_op_stukdeel_identificatie': 'str',
        'is_vermeld_in_stukdeel_identificaties': 'list[str]'
    }

    attribute_map = {
        'identificatie': 'identificatie',
        'type': 'type',
        'aanvangsdatum': 'aanvangsdatum',
        'erfpacht_canon': 'erfpachtCanon',
        'tenaamstelling': 'tenaamstelling',
        'persoon': 'persoon',
        'stuk_identificaties': 'stukIdentificaties',
        'is_gebaseerd_op_stukdeel_identificatie': 'isGebaseerdOpStukdeelIdentificatie',
        'is_vermeld_in_stukdeel_identificaties': 'isVermeldInStukdeelIdentificaties'
    }

    def __init__(self, identificatie=None, type=None, aanvangsdatum=None, erfpacht_canon=None, tenaamstelling=None, persoon=None, stuk_identificaties=None, is_gebaseerd_op_stukdeel_identificatie=None, is_vermeld_in_stukdeel_identificaties=None, local_vars_configuration=None):  # noqa: E501
        """ZakelijkGerechtigde - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._identificatie = None
        self._type = None
        self._aanvangsdatum = None
        self._erfpacht_canon = None
        self._tenaamstelling = None
        self._persoon = None
        self._stuk_identificaties = None
        self._is_gebaseerd_op_stukdeel_identificatie = None
        self._is_vermeld_in_stukdeel_identificaties = None
        self.discriminator = None

        if identificatie is not None:
            self.identificatie = identificatie
        if type is not None:
            self.type = type
        if aanvangsdatum is not None:
            self.aanvangsdatum = aanvangsdatum
        if erfpacht_canon is not None:
            self.erfpacht_canon = erfpacht_canon
        if tenaamstelling is not None:
            self.tenaamstelling = tenaamstelling
        if persoon is not None:
            self.persoon = persoon
        if stuk_identificaties is not None:
            self.stuk_identificaties = stuk_identificaties
        if is_gebaseerd_op_stukdeel_identificatie is not None:
            self.is_gebaseerd_op_stukdeel_identificatie = is_gebaseerd_op_stukdeel_identificatie
        if is_vermeld_in_stukdeel_identificaties is not None:
            self.is_vermeld_in_stukdeel_identificaties = is_vermeld_in_stukdeel_identificaties

    @property
    def identificatie(self):
        """Gets the identificatie of this ZakelijkGerechtigde.  # noqa: E501

        Identificatie van de zakelijk gerechtigde.   # noqa: E501

        :return: The identificatie of this ZakelijkGerechtigde.  # noqa: E501
        :rtype: str
        """
        return self._identificatie

    @identificatie.setter
    def identificatie(self, identificatie):
        """Sets the identificatie of this ZakelijkGerechtigde.

        Identificatie van de zakelijk gerechtigde.   # noqa: E501

        :param identificatie: The identificatie of this ZakelijkGerechtigde.  # noqa: E501
        :type: str
        """

        self._identificatie = identificatie

    @property
    def type(self):
        """Gets the type of this ZakelijkGerechtigde.  # noqa: E501


        :return: The type of this ZakelijkGerechtigde.  # noqa: E501
        :rtype: TypeGerechtigdeEnum
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this ZakelijkGerechtigde.


        :param type: The type of this ZakelijkGerechtigde.  # noqa: E501
        :type: TypeGerechtigdeEnum
        """

        self._type = type

    @property
    def aanvangsdatum(self):
        """Gets the aanvangsdatum of this ZakelijkGerechtigde.  # noqa: E501

        Datum waarop het zakelijk recht van kracht is geworden.   # noqa: E501

        :return: The aanvangsdatum of this ZakelijkGerechtigde.  # noqa: E501
        :rtype: date
        """
        return self._aanvangsdatum

    @aanvangsdatum.setter
    def aanvangsdatum(self, aanvangsdatum):
        """Sets the aanvangsdatum of this ZakelijkGerechtigde.

        Datum waarop het zakelijk recht van kracht is geworden.   # noqa: E501

        :param aanvangsdatum: The aanvangsdatum of this ZakelijkGerechtigde.  # noqa: E501
        :type: date
        """

        self._aanvangsdatum = aanvangsdatum

    @property
    def erfpacht_canon(self):
        """Gets the erfpacht_canon of this ZakelijkGerechtigde.  # noqa: E501


        :return: The erfpacht_canon of this ZakelijkGerechtigde.  # noqa: E501
        :rtype: ErfpachtCanon
        """
        return self._erfpacht_canon

    @erfpacht_canon.setter
    def erfpacht_canon(self, erfpacht_canon):
        """Sets the erfpacht_canon of this ZakelijkGerechtigde.


        :param erfpacht_canon: The erfpacht_canon of this ZakelijkGerechtigde.  # noqa: E501
        :type: ErfpachtCanon
        """

        self._erfpacht_canon = erfpacht_canon

    @property
    def tenaamstelling(self):
        """Gets the tenaamstelling of this ZakelijkGerechtigde.  # noqa: E501


        :return: The tenaamstelling of this ZakelijkGerechtigde.  # noqa: E501
        :rtype: Tenaamstelling
        """
        return self._tenaamstelling

    @tenaamstelling.setter
    def tenaamstelling(self, tenaamstelling):
        """Sets the tenaamstelling of this ZakelijkGerechtigde.


        :param tenaamstelling: The tenaamstelling of this ZakelijkGerechtigde.  # noqa: E501
        :type: Tenaamstelling
        """

        self._tenaamstelling = tenaamstelling

    @property
    def persoon(self):
        """Gets the persoon of this ZakelijkGerechtigde.  # noqa: E501


        :return: The persoon of this ZakelijkGerechtigde.  # noqa: E501
        :rtype: PersoonBeperkt
        """
        return self._persoon

    @persoon.setter
    def persoon(self, persoon):
        """Sets the persoon of this ZakelijkGerechtigde.


        :param persoon: The persoon of this ZakelijkGerechtigde.  # noqa: E501
        :type: PersoonBeperkt
        """

        self._persoon = persoon

    @property
    def stuk_identificaties(self):
        """Gets the stuk_identificaties of this ZakelijkGerechtigde.  # noqa: E501

        Dit element is de identificatie van het Stuk. Dit kan een aangeboden Stuk of een Kadasterstuk zijn.   # noqa: E501

        :return: The stuk_identificaties of this ZakelijkGerechtigde.  # noqa: E501
        :rtype: list[str]
        """
        return self._stuk_identificaties

    @stuk_identificaties.setter
    def stuk_identificaties(self, stuk_identificaties):
        """Sets the stuk_identificaties of this ZakelijkGerechtigde.

        Dit element is de identificatie van het Stuk. Dit kan een aangeboden Stuk of een Kadasterstuk zijn.   # noqa: E501

        :param stuk_identificaties: The stuk_identificaties of this ZakelijkGerechtigde.  # noqa: E501
        :type: list[str]
        """

        self._stuk_identificaties = stuk_identificaties

    @property
    def is_gebaseerd_op_stukdeel_identificatie(self):
        """Gets the is_gebaseerd_op_stukdeel_identificatie of this ZakelijkGerechtigde.  # noqa: E501

        De identificatie van het stukdeel (paragraaf in een akte met een rechtsfeit) waarop dit zakelijk recht is gebaseerd.   # noqa: E501

        :return: The is_gebaseerd_op_stukdeel_identificatie of this ZakelijkGerechtigde.  # noqa: E501
        :rtype: str
        """
        return self._is_gebaseerd_op_stukdeel_identificatie

    @is_gebaseerd_op_stukdeel_identificatie.setter
    def is_gebaseerd_op_stukdeel_identificatie(self, is_gebaseerd_op_stukdeel_identificatie):
        """Sets the is_gebaseerd_op_stukdeel_identificatie of this ZakelijkGerechtigde.

        De identificatie van het stukdeel (paragraaf in een akte met een rechtsfeit) waarop dit zakelijk recht is gebaseerd.   # noqa: E501

        :param is_gebaseerd_op_stukdeel_identificatie: The is_gebaseerd_op_stukdeel_identificatie of this ZakelijkGerechtigde.  # noqa: E501
        :type: str
        """

        self._is_gebaseerd_op_stukdeel_identificatie = is_gebaseerd_op_stukdeel_identificatie

    @property
    def is_vermeld_in_stukdeel_identificaties(self):
        """Gets the is_vermeld_in_stukdeel_identificaties of this ZakelijkGerechtigde.  # noqa: E501

        De identificaties van de stukdelen (paragrafen in een akte met een rechtsfeit) waarin deze zakelijk gerechtigde is vermeld.   # noqa: E501

        :return: The is_vermeld_in_stukdeel_identificaties of this ZakelijkGerechtigde.  # noqa: E501
        :rtype: list[str]
        """
        return self._is_vermeld_in_stukdeel_identificaties

    @is_vermeld_in_stukdeel_identificaties.setter
    def is_vermeld_in_stukdeel_identificaties(self, is_vermeld_in_stukdeel_identificaties):
        """Sets the is_vermeld_in_stukdeel_identificaties of this ZakelijkGerechtigde.

        De identificaties van de stukdelen (paragrafen in een akte met een rechtsfeit) waarin deze zakelijk gerechtigde is vermeld.   # noqa: E501

        :param is_vermeld_in_stukdeel_identificaties: The is_vermeld_in_stukdeel_identificaties of this ZakelijkGerechtigde.  # noqa: E501
        :type: list[str]
        """

        self._is_vermeld_in_stukdeel_identificaties = is_vermeld_in_stukdeel_identificaties

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, ZakelijkGerechtigde):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ZakelijkGerechtigde):
            return True

        return self.to_dict() != other.to_dict()
