using System.Net;

namespace lab_objects
{

    public partial class message
    {
        private priority m_priority;
        private IPAddress destinationAddress;
        public IPAddress DestinationAddress { get { return destinationAddress; } }
        public priority Priority { get => m_priority; set => m_priority = value; }
        private readonly int version;
        public int Version { get => version; }


    }



}